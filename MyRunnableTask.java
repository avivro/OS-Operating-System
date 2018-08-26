
public class MyRunnableTask implements Runnable {
	Args args;
	public static int count=1;
	
	public MyRunnableTask(Args args){
		this.args=args;
		
	}
	@Override
	public void run() {
		int id=args.getId();
		
		/*for (int i = 0; i > -1; i++) {*/
	while(true) {
			try {
				
				args.getSem()[id].acquire();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			int loop=args.getCount_loop();
			loop+=1;
			System.out.println("id is "+id+" loop is "+loop+" count is "+count/*+" i is "+i*/);
			args.setCount_loop(loop);
			
			if(loop<count) {
				
				args.getSem()[id].release();
			}
			else // if(loop==count)
			{
				count++;
				args.setCount_loop(0);
				if(id==2) args.getSem()[0].release();
				else  args.getSem()[id+1].release();
			}
			
			
		}
		
	}
	
	
	
}

