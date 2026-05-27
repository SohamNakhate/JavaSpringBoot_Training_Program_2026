import axios from "axios";

const API_URL = "http://localhost:8080/api/v1";

class MovieService {
  getAll() {
    return axios.get(API_URL + "/all");
  }

  create(data) {
    return axios.post(API_URL + "/movies", data);
  }

  delete(id) {
    return axios.delete(API_URL + "/movies/" + id);
  }

  update(id, data) {
    return axios.put(API_URL + "/movies/" + id, data);
  }
}

export default new MovieService();