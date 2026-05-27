import React, { Component } from "react";
import MovieService from "../services/MovieService";
class ListComponent extends Component {
  constructor(props) {
    super(props);
    this.state = {
      items: [],
    };
  }
  componentDidMount() {
    MovieService.getAll().then((res) => {
      this.setState({ items: res.data });
    });
  }
  deleteItem(id) {
    MovieService.delete(id).then((res) => {
      this.setState({
        items: this.state.items.filter((item) => item.id !== id),
      });
    });
  }

  updateItem(id) {
  const updatedMovie = {
    movieName: "Avatar",
    directorName: "James Cameron",
    rating: 9.0
  };

  MovieService.update(id, updatedMovie)
    .then((res) => {
      this.setState({
        items: this.state.items.map(item =>
          item.id === id ? res.data : item
        )
      });
    })
    .catch(error => {
      console.log(error);
    });
}

addItem() {
    const newMovie = {
        movieName: "Avengers: Endgame",
        directorName: "Anthony and Joe Russo",
        rating: 8.4
    };

    MovieService.create(newMovie)
        .then((res) => {
            this.setState({
                items: [...this.state.items, res.data]
            });
        })
        .catch(error => {
            console.log(error);
        });
}

  render() {
    return (
      <div className="container mt-4">
        <h2 className="text-center">Movie Management App</h2>
        <table className="table table-bordered">
          <thead>
            <tr>
              <th>ID</th>
              <th>Movie Name</th>
              <th>Director Name</th>
              <th>Rating</th>
              <th>Actions</th>
            </tr>
          </thead>
          <tbody>
            {this.state.items.map((item) => (
              <tr key={item.id}>
                <td>{item.id}</td>
                <td>{item.movieName}</td>
                <td>{item.directorName}</td>
                <td>{item.rating}</td>
                <td>
                  <button
                    className="btn btn-danger"
                    onClick={() => this.deleteItem(item.id)}
                  >
                    Delete
                  </button>
                  <button
                    className="btn btn-edit"
                    onClick={() => this.updateItem(item.id)}
                  >
                    Update
                  </button>
                </td>
              </tr>
            ))}
          </tbody>
        </table>

        <button className="btn btn-primary"
            onClick={() => this.addItem()}
        >Add Movie</button>

      </div>
    );
  }
}
export default ListComponent;
