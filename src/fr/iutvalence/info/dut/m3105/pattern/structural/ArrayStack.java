package fr.iutvalence.info.dut.m3105.pattern.structural;

public class ArrayStack<E> implements Stack<E>
{
	private E[] tab;
	private int nbElem;
	

	public ArrayStack(E[] tab, int nbElem)
	{
		super();
		this.tab = (E[]) new Object[10];
		this.nbElem = nbElem;
	}

	@Override
	public void push(E element)
	{
		if(this.nbElem < 10)
		{
			this.tab[nbElem+1] = element;
			this.nbElem = nbElem+1;
		}
	}

	@Override
	public E pop()
	{
		E lastElem = tab[nbElem-1];
		for(int i=nbElem-1; i > 0; i--)
		{
			tab[i] = tab[i-1];
		}
		return lastElem;
	}

	@Override
	public E peek()
	{
		return tab[nbElem-1];
	}

	@Override
	public int size()
	{
		return nbElem;
	}

}
