import axios from 'axios'
import React, { useEffect, useState } from 'react'


import { Line } from 'react-chartjs-2';
import { Chart as ChartJS } from "chart.js/auto";

import 'chartjs-adapter-date-fns';
import { Chart } from 'chart.js';



export default function V1() {

    //set time data
    const URL = "http://127.0.0.1:8080/getv3andv4data"

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
                label: "Annual average",
                data: data && data.map(d => d.annualavg),
                backgroundColor: 'red',
                borderColor: 'red',
                borderWidth: 1,
                pointRadius: 0
            },
            {
                label: "Monthly average ",
                data: data && data.map(d => d.monthlyavg),
                backgroundColor: 'Blue',
                borderColor: 'Blue',
                borderWidth: 1,
                pointRadius: 0
            },
            {
                label: "DE08",
                data: data && data.map(d => d.de08),
                backgroundColor: 'Green',
                borderColor: 'Green',
                borderWidth: 1,
                pointRadius: 0
            },
            {
                label: "DE08_2",
                data: data && data.map(d => d.de08_2),
                backgroundColor: 'Purple',
                borderColor: 'Purple',
                borderWidth: 1,
                pointRadius: 0
            },
            {
                label: "DSS",
                data: data && data.map(d => d.dss),
                backgroundColor: 'Black',
                borderColor: 'Black',
                borderWidth: 1,
                pointRadius: 0
            },


        ]
    };
   
    //options
    const options = {
        spanGaps: true,
        plugins: {
            title: {
                display: true,
                text: 'Atmospheric CO2 concentrations from Mauna Loa measurements'
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
            }
        }
    }

    return (
        <div>

            <div style={{ display: 'flex', alignItems: 'center', flexWrap: 'wrap' }}>
                <Line options={options} data={chartData} width="500px" height="auto" />
            </div>
            <div>
                <a href="https://gml.noaa.gov/ccgg/about/co2_measurements.html">Data measurement description </a>
            </div>
            <div>
                <p>This graph describes atmospheric CO2 concentrations from Mauna Loa by annual and monthly average.</p>
            </div>
        </div>
    )
}
