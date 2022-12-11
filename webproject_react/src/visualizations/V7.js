import axios from 'axios'
import React, { useEffect, useState } from 'react'


import { Line } from 'react-chartjs-2';
import { Chart as ChartJS } from "chart.js/auto";

import 'chartjs-adapter-date-fns';
import { CategoryScale, LinearScale, PointElement, LineElement, Title } from 'chart.js';


export default function V7(){

const URL = "http://127.0.0.1:8080/getv7data"
    
    const [data, setData] = useState();
    useEffect(() => {
        const address = URL;
        console.log(address);

        axios.get(address)
            .then((response) => {
                console.log(response.data);
                setData(response.data);
            }).catch(error => {
                alert(error)
            })

    }, [])

    
   data && data.sort((a,b) => a.date-b.date);

    
    const chartData = {
        labels: data && data.map(d => d.date),
        datasets: [
            {
                label: "co2",
                data: data && data.map(d => d.co2),
                backgroundColor: 'blue', 
                borderColor: 'blue',
                borderWidth: 1,
                pointRadius: 0,
                yAxisID: 'y',
            },
            {
                label: "temp",
                data: data && data.map(d => d.temp),
                backgroundColor: 'red', 
                borderColor: 'red',
                borderWidth: 1,
                pointRadius: 0,
                yAxisID: 'y1',
            },
        ]
    };

    const options = {
      spanGaps: true,
      responsive: true,
        maintainAspectRatio: false,
      plugins: {
          title: {
              display: true,
              text: 'Evolution of global temperature over the past two million years'
          }
      },
          scales: {
          x: {

              min: "-2000000",
              max: "0",
              
          },
          y: {
              position: "left",
              grace: '5%',
          },
          y1: {
            position: "right",
              grace: '5%',
          }
      },
  }


    return (
        <div> 
            <div className='mychart' style={{ display: 'flex', alignItems: 'center', flexWrap: 'wrap' }}>
            <Line data={chartData} options={options} width="500px" height="700px" />
            </div>
            <div>
                <a href="http://carolynsnyder.com/publications.php">Data used in chart</a>
            </div>
            <div>
                <a href="http://carolynsnyder.com/papers/Snyder_Data_Figures.zip">ZIP file data</a>
            </div>
            <div>
                <a href="https://climate.fas.harvard.edu/files/climate/files/snyder_2016.pdf">Data description</a>
            </div>
            <div>
                <p>Evolution of global temperature over the past two million years </p>
            </div>
        </div>
    )
}