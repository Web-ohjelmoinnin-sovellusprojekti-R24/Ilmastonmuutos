import React, { useState } from "react";

import V1 from '../visualizations/V1_V2'
import V3 from '../visualizations/V3'
import V5 from '../visualizations/V5'
import V6 from '../visualizations/V6'
import V7 from '../visualizations/V7'

export default function CreateView() {

    const [toggle, setToggle] = useState(false)
    const toggler = () => {
        toggle ? setToggle(false): setToggle(true);
    } 
    const Visual1 = () => (
            <V1/>
    )

    const [toggle3, setToggle3] = useState(false)
    const toggler3 = () => {
        toggle3 ? setToggle3(false): setToggle3(true);
    } 
    const Visual3 = () => (
        <V3/>
    )

    const [toggle5, setToggle5] = useState(false)
    const toggler5 = () => {
        toggle5 ? setToggle5(false): setToggle5(true);
    } 
    const Visual5 = () => (
        <V5/>
    )

    const [toggle6, setToggle6] = useState(false)
    const toggler6 = () => {
        toggle6 ? setToggle6(false): setToggle6(true);
    } 
    const Visual6 = () => (
        <V6/>
    )

    const [toggle7, setToggle7] = useState(false)
    const toggler7 = () => {
        toggle7 ? setToggle7(false): setToggle7(true);
    } 
    const Visual7 = () => (
        <V7/>
    )

    return (
        <div>
            <p>Create new view</p>
            <div>
                <button>Layout1</button>
            </div>
            <div>
                <button>Layout2</button>
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
                <button>Save</button>
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
        </div>
    )
}