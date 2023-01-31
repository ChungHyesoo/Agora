import axios from "axios";

// local vue api axios instance
export function apiInstance() {
    const instance = axios.create({
        // baseURL: process.env.VUE_APP_API_BASE_URL,
        baseURL: "http://localhost:9999",
        headers: {
            "Content-Type": "application/json;charset=utf-8",
        },
    });
    return instance;
}
