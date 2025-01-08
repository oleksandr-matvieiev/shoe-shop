import { useLoaderData } from "react-router-dom";
import Info from "../components/Info";
import InfoName from "../components/InfoName";

const InfoShoe = () => {
  const data: any = useLoaderData();

  const id: any[] = data.data;
  console.log(id);
  return (
    <>
      <InfoName id={id} />
      <Info id={id} />
    </>
  );
};

export default InfoShoe;
