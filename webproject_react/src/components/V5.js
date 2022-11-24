import { useEffect, useState } from "react"
import axios from 'axios';
import 'chartjs-adapter-date-fns';
import { Line } from 'react-chartjs-2';



export default function V5(){

    const URL = "http://127.0.0.1:8080/getv5data"

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


    const options = {
        plugins: {
            title: {
                display: true,
                text: 'Co2 from Vostok'
            }
        },
        scales: {
            x:{
                
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
            <div style={{display: 'flex', alignItems: 'center',flexWrap: 'wrap' }}>
            <Line options={options} data={chartData} width="500px" height="auto" />
            </div>
            <div>
                <a href="https://cdiac.ess-dive.lbl.gov/ftp/trends/co2/vostok.icecore.co2">Data used in chart</a>
            </div>
            <div>
                <a href="https://cdiac.ess-dive.lbl.gov/trends/co2/vostok.html">Data description</a>
            </div>
            <div>
                <p>Historical co2 record from the Vostok ice core</p>
            </div>
        </div>
    )

}