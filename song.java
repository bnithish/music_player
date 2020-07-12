

class song{
	private int songId;
	private String path;
	private String genre;
	public void setSongId(int songId){
		this.songId = songId;
	}
	public void setPath(String path){
		this.path = path;
	}
	public void set gnre(String genre){
		this.genre = genre;
	}
	public int getSongId(){
                return this.songId;
        }
        public String getPath(){
                return this.path;
        }
        public String get gnre(){
                return this.genre;
        }
}
