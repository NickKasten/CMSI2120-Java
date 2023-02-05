package example1;

class CNode{
	private int data = null;
	private CNode link = null;
	
	public CNode(int x, CNode y) {
		data = x;
		link = y;
	}
	
	public void setLink(CNode y) {
		link = y;
	}

	public void setData(int x) {
		data = x;
	}
	
	public CNode getLink() {
		return link;
	}

	public int getData() {
		return data;
	}
	
}
