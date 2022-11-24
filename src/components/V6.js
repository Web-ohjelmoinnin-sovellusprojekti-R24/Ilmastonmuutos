import axios from 'axios'
import React, { useEffect, useState } from 'react'


import { Line } from 'react-chartjs-2';
import { Chart as ChartJS } from "chart.js/auto";

import 'chartjs-adapter-date-fns';
import { CategoryScale, LinearScale, PointElement, LineElement, Title } from 'chart.js';




export default function V6() {

    //set time data
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
    
    //chart data
    const chartData = {
        labels: data && data.map(d => d.year),
        datasets: [
            {
                label: "co2",
                data: data && data.map(d => d.co2),
                backgroundColor: 'red', 
                borderColor: 'red',
                borderWidth: 1,
                pointRadius: 0
            },
        ]
    };
    
    //options
    const options = {
        responsive: true,
        plugins: {
            title: {
                display: true,
                text: 'Ice core 800k year composite study CO2 measurements'
            }
        },
            scales: {
            x: {
                reverse: true,
                min: -52,
                max: 805669,
                
            },
            y: {
                position: "right",
                grace: '5%',
                ticks: {
                    stepSize: 0.5
                },
            }
        },
    }
    
    return (
        <div> 
            <div style={{ display: 'flex', alignItems: 'center', flexWrap: 'wrap' }}>
            <Line data={chartData} options={options} width="500px" height="auto" />
            </div>
            <div>
                
            </div>
        </div>
    )
}