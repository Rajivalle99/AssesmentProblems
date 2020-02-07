package Assesment;

import java.io.IOException;
import java.util.LinkedList;

public class Producer_consumer 
{
	
	public static void main(String args[]) throws InterruptedException
	{
		final Procon pc=new Procon();
		
		Thread t1=new Thread(new Runnable()
				{

					@Override
					public void run() {
						// TODO Auto-generated method stub
						try
						{
							System.out.println("Thread 1");
							pc.producer1();
						}
						catch(InterruptedException e)
						{
							System.out.println(e);
						}	
					}
				});	
		Thread t2=new Thread(new Runnable()
		{

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try
				{
					System.out.println("Thread 2");
					pc.producer1();
					
				}
				catch(InterruptedException e)
				{
					System.out.println(e);
				}	
			}
		});	
		Thread t3=new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				try
				{
					System.out.println("Thread 3");
					pc.consumer();
				}
				catch(InterruptedException e)
				{
					System.out.println(e);
				}	
			}
		});
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
	}
}
class Procon
{
	LinkedList<Integer> list=new LinkedList<Integer>();
	int maxsize=3;
	
	public void producer1() throws InterruptedException
	{
		int val=0;
		while(true)
		{
			synchronized (this)
			{	
				while(list.size()==maxsize)
					wait();  //producer thread will wait if list is full
				System.out.println("Producer 1:"+val);
				list.add(val++);
				
				
				notify(); //notify to the consumer to consume
				Thread.sleep(1000);
			}
		}
	}
	
	public void producer2() throws InterruptedException
	{
		int val=0;
		while(true)
		{
			synchronized (this)
			{	
				while(list.size()==maxsize)
					wait();  //producer thread will wait if list is full
				System.out.println("Producer 2:"+val);
				list.add(val++);
				
				
				notify(); //notify to the consumer to consume
				Thread.sleep(1000);
			}
		}
	}
	
	
	
	

	
	public void consumer() throws InterruptedException
	{
		
		while(true)
		{
			synchronized (this)
			{
				while(list.size()==0)
						wait();
			
			int val=list.removeFirst();
			System.out.println("Consumer:"+val);
			
			notify();
			Thread.sleep(1000);
			
			}
		}
	}	
	
}