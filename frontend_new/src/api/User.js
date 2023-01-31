import { apiInstance } from "./index.js";

const api = apiInstance();

async function login(user, success, fail) {
    await api.post(`/user/login`, user).then(success).catch(fail);
}

async function findById(userid, success, fail) {
    api.defaults.headers["access-token"] = sessionStorage.getItem("access-token");
    await api.get(`/user/${userid}`).then(success).catch(fail);
}

async function tokenRegeneration(user, success, fail) {
    api.defaults.headers["refresh-token"] = sessionStorage.getItem("refresh-token"); //axios header에 refresh-token 셋팅
    await api.post(`/user/refresh`, user).then(success).catch(fail);
}

async function logout(userid, success, fail) {
    await api.get(`/user/logout/${userid}`).then(success).catch(fail);
}

const requestSignup = payload => api.post("/users", payload)

export { login, findById, tokenRegeneration, logout, requestSignup };
