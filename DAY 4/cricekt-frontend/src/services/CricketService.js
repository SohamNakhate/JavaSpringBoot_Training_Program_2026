import axios from "axios";

const BASE_URL = "http://localhost:8080/api/v1";

class CricketService {

    getAllPlayers() {
        return axios.get(`${BASE_URL}/all`);
    }

    addPlayer(player) {
        return axios.post(`${BASE_URL}/add`, player);
    }

    deletePlayer(id) {
        return axios.delete(`${BASE_URL}/favourites/${id}`);
    }

    getPlayerById(id){
        return axios.get(`${BASE_URL}/find/${id}`);
    }
}

export default new CricketService();