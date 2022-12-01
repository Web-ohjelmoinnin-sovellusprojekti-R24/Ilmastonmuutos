import React from "react";
import {Link} from "react-router-dom";
import 'bootstrap/dist/css/bootstrap.min.css';
import Button from 'react-bootstrap/Button';


export default function Login() {
return (
    <div>
        <h1>History Of Climate Changes</h1>
        <Link to="/v1"><Button>Login</Button></Link>
    </div>
)
}