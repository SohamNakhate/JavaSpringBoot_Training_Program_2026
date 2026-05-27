import {useState,useEffect} from "react";

export function useTypewriter(words){

const[index,setIndex]=useState(0);

useEffect(()=>{

const interval=setInterval(()=>{

setIndex(prev=>(prev+1)%words.length);

},2000);

return ()=>clearInterval(interval);

},[]);

return words[index];

}