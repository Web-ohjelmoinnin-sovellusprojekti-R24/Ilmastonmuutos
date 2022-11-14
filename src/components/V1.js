import axios from 'axios'
import React, { useEffect, useState } from 'react'


import { Line } from 'react-chartjs-2';
import { Chart as ChartJS } from "chart.js/auto";

import 'chartjs-adapter-date-fns';
import { Chart } from 'chart.js';



export default function V1() {
    //set time data
    const URL = "http://127.0.0.1:8080/getalldata"
    
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
    const [chartData, setChartData] = useState({
        labels: data,
        datasets: [
            {
                label: "Anomaly_deg_C_Global_NH_SH_2_Monthly",
                data: data,
                //globalmonthly.map(d => d.amount),
                backgroundColor: 'red', 
                borderColor: 'red',
                borderWidth: 1
            },
            /*{
                label: "Anomaly_deg_C_Northern_hemisphere",
                data: data,
                //globalmonthly.map(d => d.amount),
                backgroundColor: 'blue',
                borderColor: 'blue',
                borderWidth: 1
            },
            {
                label: "Anomaly_deg_C_Southern_hemisphere",
                data: data,
                //globalmonthly.map(d => d.amount),
                backgroundColor: 'green',
                borderColor: 'green',
                borderWidth: 1
            }*/
        ]
    });

    //options
    const options = {
        responsive: true,
        plugins: {
            title: {
                display: true,
                text: 'Temperature anomalies form 1850'
            }
        },
        scales: {
            x: {
                type: 'time',
                time: {
                    unit: 'month'
                }
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
                <p>{data}</p>
            </div>
        </div>
    )
}
