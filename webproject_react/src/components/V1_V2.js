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
        const address = URL
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
                label: "2000 year temperatures",
                data: data && data.map(d => d.globalc),
                backgroundColor: 'red',
                borderColor: 'red',
                borderWidth: 1,
                pointRadius: 0
            },
            {
                label: "Global ",
                data: data && data.map(d => d.globald),
                backgroundColor: 'yellow',
                borderColor: 'yellow',
                borderWidth: 1,
                pointRadius: 0
            },
            {
                label: "Northern Hemisphere",
                data: data && data.map(d => d.northernd),
                backgroundColor: 'blue',
                borderColor: 'blue',
                borderWidth: 1,
                pointRadius: 0
            },
            {
                label: "Southern Hemisphere",
                data: data && data.map(d => d.southernd),
                backgroundColor: 'green',
                borderColor: 'green',
                borderWidth: 1,
                pointRadius: 0
            },

        ]
    };

    //options
    const options = {
        plugins: {
            title: {
                display: true,
                text: 'Temperature anomalies form 1850'
            }
        },
        scales: {
            x: {
                type: 'time',
                max: 2000,
                time: {
                    unit: 'year'
                    
                }
            },
            y: {
                position: "right",
                grace: '5%',
                ticks: {
                    stepSize: 0.5
                },
            }
        }
    }

    return (
        <div>

            <div style={{ display: 'flex', alignItems: 'center', flexWrap: 'wrap' }}>
                <Line options={options} data={chartData} width="500px" height="auto" />
            </div>
            <div>
                <a href="https://gml.noaa.gov/ccgg/about/co2_measurements.html">Co2 measurements</a>
            </div>
            <div>
                <p>This graph describes CO2 measurements globally, by northern hemisphere, by southern hemisphere and compares it to data of 2000 year temperatures. </p>
            </div>
        </div>
    )
}
