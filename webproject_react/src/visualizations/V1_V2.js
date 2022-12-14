import axios from 'axios'
import React, { useEffect, useState } from 'react'


import { Line } from 'react-chartjs-2';
import { Chart as ChartJS } from "chart.js/auto";

import 'chartjs-adapter-date-fns';
import { Chart } from 'chart.js';



export default function V1() {

    const URL = "http://127.0.0.1:8080/getv1v2data"

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

    const chartData = {

        datasets: [
            {
                label: "2000 year temperatures",
                data: data,
                backgroundColor: 'red',
                borderColor: 'red',
                borderWidth: 1,
                parsing: {
                    xAxisKey: "date",
                    yAxisKey: "globalc",
                  },
                pointRadius: 0
            },
            {
                label: "Global ",
                data: data,
                backgroundColor: 'yellow',
                borderColor: 'yellow',
                borderWidth: 1,
                parsing: {
                    xAxisKey: "date",
                    yAxisKey: "globald",
                  },
                pointRadius: 0
            },
            {
                label: "Northern Hemisphere",
                data: data,
                backgroundColor: 'blue',
                borderColor: 'blue',
                borderWidth: 1,
                parsing: {
                    xAxisKey: "date",
                    yAxisKey: "northernd",
                  },
                pointRadius: 0
            },
            {
                label: "Southern Hemisphere",
                data: data,
                backgroundColor: 'green',
                borderColor: 'green',
                borderWidth: 1,
                parsing: {
                    xAxisKey: "date",
                    yAxisKey: "southernd",
                  },
                pointRadius: 0
            },

        ]
    };


    const options = {
        responsive: true,
        maintainAspectRatio: false,
        plugins: {
            title: {
                display: true,
                text: 'Temperature anomalies from 1850'
            }
        },
        scales: {
            x: {
                type: 'time',
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

            <div className='mychart' style={{ display: 'flex', alignItems: 'center', flexWrap: 'wrap' }}>
                <Line options={options} data={chartData} width="500px" height="700px" />
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
