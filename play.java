import java.util.ArrayList;

class player{
	private int volume = 0;
	private int volLimit = 10;
	private ArrayList<Integer> songList = new ArrayList<Integer>();
	private int curSong = -1;
	public int getVolume(){
		return this.volume;
	}
	public void increaseVolume(){
		if(this.volume < this.volLimit){
			this.volume++;
		}
	}
	public void decreaseVolume(){
		if(this.volume > 0){
			this.volume--;
		}
	}
	public void addSong(int songId){
		if(songList.size()==0)this.curSong++;
		this.songList.add(songId);
	}
	public void playNextSong(){
		if(this.songList.size()>curSong+1){
			curSong++;
			this.play();
		}
	}
	public void playPrevSong(){
		if(curSong>0){
			curSong--;
			this.play();
		}
	}
	public void play(){
		if(curSong<0){
			System.out.println("No song to play!");
		}else{
			System.out.println("Playing song:" + this.songList.get(curSong));
		}
	}
}

class play{
	public static void main(String[] args){
		player Player = new player();
	}
}
			

