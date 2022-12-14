import React from 'react'
import V1 from '../visualizations/V1_V2'
import V3 from '../visualizations/V3'
import V5 from '../visualizations/V5'
import V6 from '../visualizations/V6'
import V7 from '../visualizations/V7'


export default function Default1() {
  return (
    <div>
        <center>
            <h4>Temperature data and co2 concentrations</h4>
        </center>
        <div>
            <V1/>
        </div>
        <div>
            <V3/>
        </div>
        <div>
            <V5/>
        </div>
        <div>
            <V6/>
        </div>
        <div>
            <V7/>
        </div>
    </div>
  )
}
