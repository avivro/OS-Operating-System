

import java.util.concurrent.Semaphore;


public class Args {
	private int id;
	private Semaphore[] sem;
	private static int count_loop=0;
	
	/**
	 * Constructor.
	 * @param id
	 * @param sem

	 */
	public Args(int id, Semaphore[] sem) {
		this.id = id;
		this.sem = sem;
		
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the a
	 */
	public Semaphore[] getSem() {
		return sem;
	}


	/**
	 * @param a the a to set
	 */
	public void setSem(Semaphore[] sem) {
		this.sem = sem;
	}


	/**
	 * @return the arr
	 */
	public int  getCount_loop() {
		return count_loop;
	}


	/**
	 * @param arr the arr to set
	 */
	public void setCount_loop(int num) {
		this.count_loop = num;
	}




	
}
