package kanji2int;

public class Kanji2Int {
	public Kanji2Int() {
	}

	public int convert(String s) {
		int ans = 0;
		int num = 0 ;
		int keta = s.length();
		for (int i = 0; i < keta; i++) {
			char c = s.charAt(i);
			switch (c) {
			case '〇':
				num = 0;
				break;
			case '一':
				num = 1;
				break;
			case '二':
				num = 2;
				break;
			case '三':
				num = 3;
				break;
			case '四':
				num = 4;
				break;
			case '五':
				num = 5;
				break;
			case '六':
				num = 6;
				break;
			case '七':
				num = 7;
				break;
			case '八':
				num = 8;
				break;
			case '九':
				num = 9;
				break;
			default:
				num = -1;
				break;
			}
			if(num>=0){
				ans += num * Math.pow(10.0, keta-i-1);
			} else {
				return -1;
			}
		}
		return ans;
	}
}
