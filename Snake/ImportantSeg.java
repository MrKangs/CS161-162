//package ezsnake;
import java.util.ArrayList;

//sets up window/arrays for color of snake/position and food

public class ImportantSeg extends Thread {
	 ArrayList<ArrayList<Colors>> Squares= new ArrayList<ArrayList<Colors>>();
	 Tuple headSnakePos;
	 int sizeSnake=3;
	 long speed = 80;
	 public static int directionSnake ;

	 ArrayList<Tuple> positions = new ArrayList<Tuple>();
	 Tuple foodPosition;


	 ImportantSeg(Tuple positionDepart){

		Squares=Window.Grid;

		headSnakePos=new Tuple(positionDepart.x,positionDepart.y);
		directionSnake = 1;


		Tuple headPos = new Tuple(headSnakePos.getX(),headSnakePos.getY());
		positions.add(headPos);

		foodPosition= new Tuple(Window.height-1,Window.width-1);
		spawnFood(foodPosition);

	 }
//while running it updates every method

	 public void run() {
		 while(true){
			 moveInterne(directionSnake);
			 checkCollision();
			 moveExterne();
			 deleteTail();
			 pauser();
		 }
	 }

//stops it from going to a blackscreen
	 private void pauser(){
		 try {
				sleep(speed);
		 } catch (InterruptedException e) {
				e.printStackTrace();
		 }
	 }

//collision checker
	 private void checkCollision() {
		 Tuple posCritique = positions.get(positions.size()-1);
		 for(int i = 0;i<=positions.size()-2;i++){
			 boolean biteItself = posCritique.getX()==positions.get(i).getX() && posCritique.getY()==positions.get(i).getY();
			 if(biteItself){
				stopTheGame();
			 }
		 }
//changes food spawn
		 boolean eatingFood = posCritique.getX()==foodPosition.y && posCritique.getY()==foodPosition.x;
		 if(eatingFood){
			 System.out.println("NoicePickin!");
			 sizeSnake=sizeSnake+1;
			 	foodPosition = AppleSpawn();

			 spawnFood(foodPosition);
		 }
	 }


	 private void stopTheGame(){
		 System.out.println("YouLose! \n");
		 while(true){

			 pauser();

		 }
	 }


	 private void spawnFood(Tuple foodPositionIn){
		 	Squares.get(foodPositionIn.x).get(foodPositionIn.y).NewAppleBlock(1);
	 }

//Help size of snake and new apple spawn
	 private Tuple AppleSpawn(){
		 Tuple p ;
		 int ranX= 0 + (int)(Math.random()*19);
		 int ranY= 0 + (int)(Math.random()*19);
		 p=new Tuple(ranX,ranY);
		 for(int i = 0;i<=positions.size()-1;i++){
			 if(p.getY()==positions.get(i).getX() && p.getX()==positions.get(i).getY()){
				 ranX= 0 + (int)(Math.random()*19);
				 ranY= 0 + (int)(Math.random()*19);
				 p=new Tuple(ranX,ranY);
				 i=0;
			 }
		 }
		 return p;
	 }


	 private void moveInterne(int dir){
		 switch(dir){
		 	case 4:
				 headSnakePos.ChangeData(headSnakePos.x,(headSnakePos.y+1)%20);
				 positions.add(new Tuple(headSnakePos.x,headSnakePos.y));
		 		break;
		 	case 3:
		 		if(headSnakePos.y-1<0){
		 			 headSnakePos.ChangeData(headSnakePos.x,19);
		 		 }
		 		else{
				 headSnakePos.ChangeData(headSnakePos.x,Math.abs(headSnakePos.y-1)%20);
		 		}
				 positions.add(new Tuple(headSnakePos.x,headSnakePos.y));
		 		break;
		 	case 2:
		 		 if(headSnakePos.x-1<0){
		 			 headSnakePos.ChangeData(19,headSnakePos.y);
		 		 }
		 		 else{
		 			 headSnakePos.ChangeData(Math.abs(headSnakePos.x-1)%20,headSnakePos.y);
		 		 }
		 		positions.add(new Tuple(headSnakePos.x,headSnakePos.y));

		 		break;
		 	case 1:
				 headSnakePos.ChangeData(Math.abs(headSnakePos.x+1)%20,headSnakePos.y);
				 positions.add(new Tuple(headSnakePos.x,headSnakePos.y));
		 		 break;
		 }
	 }


	 private void moveExterne(){
		 for(Tuple t : positions){
			 int y = t.getX();
			 int x = t.getY();
			 Squares.get(x).get(y).NewAppleBlock(0);

		 }
	 }

//deletes tail art and controls collision
	 private void deleteTail(){
		 int cmpt = sizeSnake;
		 for(int i = positions.size()-1;i>=0;i--){
			 if(cmpt==0){
				 Tuple t = positions.get(i);
				 Squares.get(t.y).get(t.x).NewAppleBlock(2);
			 }
			 else{
				 cmpt--;
			 }
		 }
		 //deletes tail entity
		 cmpt = sizeSnake;
		 for(int i = positions.size()-1;i>=0;i--){
			 if(cmpt==0){
				 positions.remove(i);
			 }
			 else{
				 cmpt--;
			 }
		 }
	 }
}