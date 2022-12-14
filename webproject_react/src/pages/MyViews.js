import React, { useEffect, useState } from 'react'
import axios from "axios";





export default function MyViews() {

  const URL = "http://localhost:8080/views";
  const instance = axios.create({
    baseURL: 'http://localhost:8080/views'
  });
  //tokenin tarkistus
  const storedJwt = sessionStorage.getItem('token');
  instance.defaults.headers.common['Authorization'] = `Bearer ${storedJwt}`;
  useEffect(() => {
    const address = URL
    console.log(address);
    instance.get()
        .then((response) => {
            console.log(response);
        }).catch(error => {
            alert(error)
        })
}, [])

  return (
    <div>MyViews</div>
  )
}
