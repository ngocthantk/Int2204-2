package lab03_Cau2;

public class PS {
	private int TS, MS;

	public PS() {
		this.TS = 1;
		this.MS = 1;
	}

	public PS(int a, int b) {
		this.TS = a;
		this.MS = b;
	}

	public void setT(int a) {
		this.TS = a;
	}

	public int getT() {
		return this.TS;
	}

	public void setM(int a) {
		this.MS = a;
	}

	public int getM() {
		return this.MS;
	}

	public void rutGon() {
		if(this.TS!=0)
		{	
		int a = this.TS;
		int b = this.MS;
		if (a < 0) {
			a = -a;
		}
		if (b < 0) {
			b = -b;
		}
		while (a != b) {
			if (a < b) {
				b = b - a;
			} else {
				a = a - b;
			}
		}
		if((this.TS<0&&this.MS<0)||(this.TS>0&&this.MS<0))
		{this.TS = -this.TS / a;
		this.MS = -this.MS / a;}
		else
		{
				this.TS = -this.TS / a;
				this.MS = -this.MS / a;
		}
		}
		// return t;
	}

	public PS Cong(PS t) {
		PS Cong = new PS();
		Cong.TS = t.TS * this.MS + t.MS * this.TS;
		Cong.MS = t.MS * this.MS;
		Cong.rutGon();
		return Cong;
	}

	public PS Tru(PS t) {
		PS Tru = new PS();
		Tru.TS = this.TS * t.MS - this.MS * t.TS;
		Tru.MS = t.MS * this.MS;
		Tru.rutGon();
		return Tru;
	}

	public PS Nhan(PS t) {
		PS Nhan = new PS();
		Nhan.MS = t.MS * this.MS;
		Nhan.TS = t.TS * this.TS;
		Nhan.rutGon();
		return Nhan;
	}

	public PS Chia(PS t) {
		PS chia = new PS();
		chia.TS = this.TS * t.MS;
		chia.MS = this.MS * t.TS;
		chia.rutGon();
		return chia;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj instanceof PS) {
			PS PS1 = (PS) obj;
			if (this.TS * PS1.MS == this.MS * PS1.TS)
				return true;
		}
		return false;

	}
}
