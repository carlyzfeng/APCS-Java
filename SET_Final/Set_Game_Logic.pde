//CHANGE

boolean sameColor(Card a, Card b, Card c) {
  return a.sameColor(b) && b.sameColor(c);
}

boolean sameShape(Card a, Card b, Card c) {
  return a.sameShape(b) && b.sameShape(c);
  //if((a.getShape() == b.getShape()) && (b.getShape() == c.getShape())){
  //  return true;
  //}
  //else{
  //  return false;
  //}
}

boolean sameFill(Card a, Card b, Card c) {
  return a.sameFill(b) && b.sameFill(c);
  //if((a.getFill() == b.getFill()) && (b.getFill() == c.getFill())){
  //  return true;
  //}
  //else{
  //  return false;
  //}
}

boolean sameCount(Card a, Card b, Card c) {
  return a.sameCount(b) && b.sameCount(c);
  //if((a.getCount() == b.getCount()) && (b.getCount() == c.getCount())){
  //  return true;
  //}
  //else{
  //  return false;
  //}
}

boolean diffColor(Card a, Card b, Card c) {
  return (!a.sameColor(b) && !b.sameColor(c) && !a.sameColor(c));
  
  //if((a.getColor() != b.getColor()) && (a.getColor() != c.getColor()) && (b.getColor() != c.getColor())){
  //  return true;
  //}
  //else{
  //  return false;
  //}
}

boolean diffShape(Card a, Card b, Card c) {
  return (!a.sameShape(b) && !b.sameShape(c) && !a.sameShape(c));
  
  //if((a.getShape() != b.getShape()) && (a.getShape() != c.getShape()) && (b.getShape() != c.getShape())){
  //  return true;
  //}
  //else{
  //  return false;
  //}
}

boolean diffFill(Card a, Card b, Card c) {
  return (!a.sameFill(b) && !b.sameFill(c) && !a.sameFill(c));
  
  //if((a.getFill() != b.getFill()) && (a.getFill() != c.getFill()) && (b.getFill() != c.getFill())){
  //  return true;
  //}
  //else{
  //  return false;
  //}
}

boolean diffCount(Card a, Card b, Card c) {
  return (!a.sameCount(b) && !b.sameCount(c) && !a.sameCount(c));
  
  //if((a.getCount() != b.getCount()) && (a.getCount() != c.getCount()) && (b.getCount() != c.getCount())){
  //  return true;
  //}
  //else{
  //  return false;
  //}
}  

boolean isSet(Card a, Card b, Card c) {
  return (sameColor(a, b, c) || diffColor(a, b, c)) && (sameShape(a, b, c) || diffShape(a, b, c)) && (sameFill(a, b, c) || diffFill(a, b, c)) && (sameCount(a, b, c) || diffCount(a, b, c));
}
