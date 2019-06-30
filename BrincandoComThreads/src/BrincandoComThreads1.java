
public class BrincandoComThreads1 {
	
	public static void main(String args[]){
		new Thread(t1).start();
		new Thread(t2).start();
	}

	private static Runnable t1 = new Runnable() {
		
		@Override
		public void run() {
			for(int i=1; i<11; i++){
				if(i % 2 == 0){
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("-EXECUTANDO A THREAD 1: " + i);
			}
		}
	};
	
	private static Runnable t2 = new Runnable() {
			
			@Override
			public void run() {
				for(int i=1; i<11; i++){
					if(i % 2 == 1){
						try {
							Thread.sleep(5000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					System.out.println("+EXECUTANDO A THREAD 2: " + i);
				}
			}
		};
}
