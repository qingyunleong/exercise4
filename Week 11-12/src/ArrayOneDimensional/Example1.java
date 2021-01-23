package ArrayOneDimensional;

public class Example1 {

	public static void main(String[] args) {
		
		System.out.println("Welcom to our zombie killer program!!!!");
		
		String backpack[] = {"Shotgun","Assault Rifle","Sniper"};
		String zombies[] = {"Close-Range zombie","Mid-Range zombie","Long-Range zombie"};
		int numbersZombiesHATE[] = {4, 90, 70, 123, 12, 4, 561, 1};
		
		int ZombiesNotHATE[];
		ZombiesNotHATE = new int [4];
		ZombiesNotHATE[0] = 1;
		ZombiesNotHATE[1] = 10;
		ZombiesNotHATE[2] = 100;
		ZombiesNotHATE[3] = 1000;
		
		System.out.println("Backpack Items!");
		System.out.println(backpack[0]);
		System.out.println(backpack[1]);
		System.out.println(backpack[2]);
		
		System.out.println("These are the zombies!");
		System.out.println(zombies[0]);
		System.out.println(zombies[1]);
		System.out.println(zombies[2]);
		
		System.out.println("Number zombies hate: ");
		System.out.println(numbersZombiesHATE[6]);
		
		System.out.println("Number zombies NOT hate: ");
		System.out.println(ZombiesNotHATE[2]);
		System.out.println(ZombiesNotHATE[3]);
	}

}
