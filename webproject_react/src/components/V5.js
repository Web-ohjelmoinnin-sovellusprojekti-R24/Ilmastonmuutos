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
            x: { 
                
                    reverse: true,
                    min: 2342,
                    max: 417160,  
            },
            y: {
                position: "right",
                grace: '5%',
                ticks: {
                    stepSize: 0.1
                    
                },
            }
        }
    }


    return (
        <div>
            <div style={{display: 'flex', alignItems: 'center',flexWrap: 'wrap' }}>
            <Line options={options} data={chartData} width="500px" height="auto" />
            </div>
        </div>
    )

}