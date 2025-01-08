interface Prop {
  id: any;
}

const InfoName = ({ id }: Prop) => {
  return (
    <div className="name">
      <p>{id.shoes_name}</p>
    </div>
  );
};

export default InfoName;
