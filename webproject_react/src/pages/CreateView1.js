import React, { useState } from "react";
import { Link } from "react-router-dom";
import axios from "axios";

import 'bootstrap/dist/css/bootstrap.min.css';
import { Form } from 'react-bootstrap';

import V1 from '../visualizations/V1_V2'
import V3 from '../visualizations/V3'
import V5 from '../visualizations/V5'
import V6 from '../visualizations/V6'
import V7 from '../visualizations/V7'
import V9 from '../visualizations/V9'


export default function CreateView() {

    const [savemessage, setsavemessage] = useState("")

    //Sending the post request with params
    const URL = "/createview";
    function handleSubmit(event) {
        setsavemessage("Saved")
        axios.post(URL, {
        },
            {
                params: {
                    layout: 1,
                    v1: toggle,
                    v3: toggle3,
                    v5: toggle5,
                    v6: toggle6,
                    v7: toggle7,
                    v9: toggle9,
                },
            }
        )
            .then(function (response) {
                console.log(response);
            })
            .catch(function (error) {
                console.log(error);
            })
        event.preventDefault();
    }

    //Visual 1 and 2
    const [toggle, setToggle] = useState(false)
    const toggler = () => {
        toggle ? setToggle(false) : setToggle(true);
        setSuccessMessage("");
    }
    const [V1text, setV1text] = useState("")
    const [successMessage, setSuccessMessage] = useState("");
    const V1Save = () => {
        setV1text(document.getElementById('v1input').value)
        //console.log("users value is: " + V1text);
        setSuccessMessage("Saved")
    }
    const Visual1 = () => (
        <div>
            <V1 />
            <input type="text" id="v1input" placeholder="TEXT" />
            <button onClick={V1Save}>Save</button>
            <p>{successMessage}</p>
        </div>
    )

    //Visual 3 and 4
    const [toggle3, setToggle3] = useState(false)
    const toggler3 = () => {
        toggle3 ? setToggle3(false) : setToggle3(true);
    }
    const Visual3 = () => (
        <V3 />
    )

    //Visual 5
    const [toggle5, setToggle5] = useState(false)
    const toggler5 = () => {
        toggle5 ? setToggle5(false) : setToggle5(true);
    }
    const Visual5 = () => (
        <V5 />
    )

    //Visual 6
    const [toggle6, setToggle6] = useState(false)
    const toggler6 = () => {
        toggle6 ? setToggle6(false) : setToggle6(true);
    }
    const Visual6 = () => (
        <V6 />
    )

    //Visual 7
    const [toggle7, setToggle7] = useState(false)
    const toggler7 = () => {
        toggle7 ? setToggle7(false) : setToggle7(true);
    }
    const Visual7 = () => (
        <V7 />
    )

    //Visual 9
    const [toggle9, setToggle9] = useState(false)
    const toggler9 = () => {
        toggle9 ? setToggle9(false) : setToggle9(true);
    }
    const Visual9 = () => (
        <V9 />
    )

    return (
        <div>
            <p className='layouttext'>Create new view</p>
            <div>
                <p className='layouttext'>Layout1/<Link to="/createview2">Layout2</Link></p>
            </div>

            <div>
                <label className="labeltext">V1</label>
                <input type="checkbox" onClick={toggler} />
            </div>
            <div>
                <label className="labeltext">V3</label>
                <input type="checkbox" onClick={toggler3} />
            </div>
            <div>
                <label className="labeltext">V5</label>
                <input type="checkbox" onClick={toggler5} />
            </div>
            <div>
                <label className="labeltext">V6</label>
                <input type="checkbox" onClick={toggler6} />
            </div>
            <div>
                <label className="labeltext">V7</label>
                <input type="checkbox" onClick={toggler7} />
            </div>
            <div>
                <label className="labeltext">V9</label>
                <input type="checkbox" onClick={toggler9} />
            </div>

            <div>
                <button type="submit" onClick={handleSubmit} >Save</button>
                <p>{savemessage}</p>
            </div>

            <div>
                {toggle ? <Visual1 /> : null}
            </div>
            <div>
                {toggle3 ? <Visual3 /> : null}
            </div>
            <div>
                {toggle5 ? <Visual5 /> : null}
            </div>
            <div>
                {toggle6 ? <Visual6 /> : null}
            </div>
            <div>
                {toggle7 ? <Visual7 /> : null}
            </div>
            <div>
                {toggle9 ? <Visual9 /> : null}
            </div>
        </div>
    )
}