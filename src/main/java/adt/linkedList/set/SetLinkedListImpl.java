package adt.linkedList.set;

import adt.linkedList.SingleLinkedListImpl;
import adt.linkedList.SingleLinkedListNode;

public class SetLinkedListImpl<T> extends SingleLinkedListImpl<T> implements SetLinkedList<T> {

	@Override
	public void removeDuplicates() {
		SingleLinkedListNode<T> node = this.getHead();
		//SingleLinkedListNode<T> auxNode = this.getHead().getNext();
		SingleLinkedListNode<T> aux = null;
		
		while(node!= null){
			SingleLinkedListNode<T> auxNode = node.getNext();
			while(auxNode!= null){
				
				if(node.getData().equals(auxNode.getData())){
					
					auxNode.setData(auxNode.getNext().getData());
					auxNode.setNext(auxNode.getNext().getNext());	
					
				}else  {
					auxNode = auxNode.getNext();
				}
			}
			
			node = node.getNext();
		}
	}

	@Override
	public SetLinkedList<T> union(SetLinkedList<T> otherSet) {
		//TODO Implement your code here
		throw new UnsupportedOperationException("Not implemented yet!");
	}

	@Override
	public SetLinkedList<T> intersection(SetLinkedList<T> otherSet) {
		//TODO Implement your code here
		throw new UnsupportedOperationException("Not implemented yet!");
	}

	@Override
	public void concatenate(SetLinkedList<T> otherSet) {
		//TODO Implement your code here
		throw new UnsupportedOperationException("Not implemented yet!");
	}

}
