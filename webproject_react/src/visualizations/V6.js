import axios from 'axios'
import React, { useEffect, useState } from 'react'


import { Line } from 'react-chartjs-2';
import { Chart as ChartJS } from "chart.js/auto";

import 'chartjs-adapter-date-fns';
import { CategoryScale, LinearScale, PointElement, LineElement, Title } from 'chart.js';




export default function V6() {

    //set time data
    const URL = "http://127.0.0.1:8080/getv6data"
    
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

        labels: data && data.map(d => d.date),
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
        maintainAspectRatio: false,
        plugins: {
            title: {
                display: true,
                text: 'Ice core 800k year composite study CO2 measurements'
            }
        },
            scales: {
            x: {
                reverse: true,
                min: -803717,
                max: 2002
                
            },
            y: {
                position: "left",
                grace: '5%',
                ticks: {
                    stepSize: 10
                },
            }
        },
    }
    
    return (
        <div> 
            <div className='mychart' style={{ display: 'flex', alignItems: 'center', flexWrap: 'wrap' }}>
            <Line data={chartData} options={options} width="500px" height="700px" />
            </div>
            <div>
                <a href="https://www.ncei.noaa.gov/pub/data/paleo/icecore/antarctica/antarctica2015co2composite.txt">Data used in chart</a>
            </div>
            <div>
                <a href="https://www.ncei.noaa.gov/access/paleo-search/study/17975">Data description</a>
            </div>
            <div>
                <p>Antarctic Ice Cores Revised 800KYr CO2 Data</p>
            </div>
        </div>
    )
}