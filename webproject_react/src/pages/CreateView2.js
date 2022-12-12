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

export default function CreateView2() {

  const [savemessage, setsavemessage] = useState("")

  //Sending the post request with params
  const URL = "http://localhost:8080/createview";
  function handleSubmit(event) {
    setsavemessage("Saved")
    axios.post(URL, {
    },
      {
        params: {
          v1: toggle,
          v3: toggle3,
          v5: toggle5,
          v6: toggle6,
          v7: toggle7,
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


  return (
    <div>
      <p>Create new view</p>
      <div>
        <p><Link to="/createview1">Layout1</Link>/Layout2</p>
      </div>

      <div>
        <label>V1</label>
        <input type="checkbox" onClick={toggler} />
      </div>
      <div>
        <label>V3</label>
        <input type="checkbox" onClick={toggler3} />
      </div>
      <div>
        <label>V5</label>
        <input type="checkbox" onClick={toggler5} />
      </div>
      <div>
        <label>V6</label>
        <input type="checkbox" onClick={toggler6} />
      </div>
      <div>
        <label>V7</label>
        <input type="checkbox" onClick={toggler7} />
      </div>

      <div>
        <button type="submit" onClick={handleSubmit} >Save</button>
        <p>{savemessage}</p>
      </div>

      <div class="row">
        <div class="col-md-6">
          {toggle ? <Visual1 /> : null}
        </div>
        <div class="col-md-6">
          {toggle3 ? <Visual3 /> : null}
        </div>
        <div class="col-md-6" >
          {toggle5 ? <Visual5 /> : null}
        </div>
        <div class="col-md-6" >
          {toggle6 ? <Visual6 /> : null}
        </div>
        <div class="col-md-6" >
          {toggle7 ? <Visual7 /> : null}
        </div>
      </div>

    </div>
  )
}