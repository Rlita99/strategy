package strategy;

public class MagicalGirls implements MagicWand {

	private String name;
	
	public MagicalGirls(String name) {
		this.name = name;
	}
	
									// 얘는 뭐하는 앤지...?
	public MagicalGirls(String name, MagicWand wand) {
		this.name = name;
		this.wand = wand;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	// 이건 왜 쓰는지...?
	private MagicWand wand;
	
	public void MagicWand() {
		wand.wand();
	}

	public MagicWand getWand() {
		return wand;
	}

	public void setWand(MagicWand wand) {
		this.wand = wand;
	}
		
	public void transformLine(String line) {
		System.out.println(line);
	}
	
}
