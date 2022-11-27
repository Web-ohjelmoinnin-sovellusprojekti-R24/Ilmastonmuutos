import axios from 'axios'
import React, { useEffect, useState } from 'react'


import { Line } from 'react-chartjs-2';
import { Chart as ChartJS } from "chart.js/auto";

import 'chartjs-adapter-date-fns';
import { CategoryScale, LinearScale, PointElement, LineElement, Title } from 'chart.js';


export default function V7(){

const URL = "http://127.0.0.1:8080/v6data"
    
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

    const chartData = {
        labels: data && data.map(d => d.year),
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

    const config = {
        type: 'line',
        data: data,
        options: {
          responsive: true,
          interaction: {
            mode: 'index',
            intersect: false,
          },
          stacked: false,
          plugins: {
            title: {
              display: true,
              text: 'Evolution of global temperature over the past two million years'
            }
          },
          scales: {
            x: {
              type: 'time',
          },
            y: {
              type: 'linear',
              display: true,
              position: 'left',
            },
            y1: {
              type: 'linear',
              display: true,
              position: 'right',
      
              // grid line settings
              grid: {
                drawOnChartArea: false, // only want the grid lines for one axis to show up
              },
            },
          }
        },
      };


    return (
        <div> 
            <div style={{ display: 'flex', alignItems: 'center', flexWrap: 'wrap' }}>
            <Line data={chartData} config={config} width="500px" height="auto" />
            </div>
            <div>
                
            </div>
        </div>
    )
}