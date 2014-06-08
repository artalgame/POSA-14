// Import the necessary Java synchronization and scheduling classes.

package edu.vuum.mocca;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @class SimpleAtomicLong
 *
 * @brief This class implements a subset of the
 *        java.util.concurrent.atomic.SimpleAtomicLong class using a
 *        ReentrantReadWriteLock to illustrate how they work.
 */
class SimpleAtomicLong
{
    /**
     * The value that's manipulated atomically via the methods.
     */
    private long mValue;


    /**
     * The ReentrantReadWriteLock used to serialize access to mValue.
     */
<<<<<<< HEAD

    // TODO -- you fill in here by replacing the null with an
    // initialization of ReentrantReadWriteLock.
    private final ReentrantReadWriteLock mRWLock = new ReentrantReadWriteLock();
=======
    // TODO - add the implementation
>>>>>>> upstream/master

    /**
     * Creates a new SimpleAtomicLong with the given initial value.
     */
<<<<<<< HEAD
    public SimpleAtomicLong(long initialValue)
    {
        // TODO -- you fill in here
    	mValue = initialValue;
=======
    public SimpleAtomicLong(long initialValue) {
        // TODO - you fill in here
>>>>>>> upstream/master
    }

    /**
     * @brief Gets the current value
     * 
     * @returns The current value
     */
<<<<<<< HEAD
    public long get()
    {
    	// TODO -- you fill in here
    	try{
    		mRWLock.readLock().lock();
    		long value = mValue;
        	return value;
        }
        finally{
        	mRWLock.readLock().unlock();
        }
=======
    public long get() {
        // TODO - you fill in here
>>>>>>> upstream/master
    }

    /**
     * @brief Atomically decrements by one the current value
     *
     * @returns the updated value
     */
<<<<<<< HEAD
    public long decrementAndGet()
    {
    	// TODO -- you fill in here
    	try{
    		mRWLock.writeLock().lock();
    		mRWLock.readLock().lock();
    		mValue--;
    		long value = mValue;
        	mRWLock.writeLock().unlock();
        	return value;
        }
        finally{
        	mRWLock.readLock().unlock();
        }
        
=======
    public long decrementAndGet() {
        // TODO - you fill in here
>>>>>>> upstream/master
    }

    /**
     * @brief Atomically increments by one the current value
     *
     * @returns the previous value
     */
<<<<<<< HEAD
    public long getAndIncrement()
    {
    	// TODO -- you fill in here
    	 try{
    		 mRWLock.writeLock().lock();
     		 mRWLock.readLock().lock();
    		 long value = mValue;
    		 mValue++;
    		 mRWLock.writeLock().unlock();
    		 return value;
    	 }
    	 finally{
    		 mRWLock.readLock().unlock();
    	 }
=======
    public long getAndIncrement() {
        // TODO - you fill in here
>>>>>>> upstream/master
    }

    /**
     * @brief Atomically decrements by one the current value
     *
     * @returns the previous value
     */
<<<<<<< HEAD
    public long getAndDecrement()
    {
    	// TODO -- you fill in here
    	try{
    		mRWLock.writeLock().lock();
    		mRWLock.readLock().lock();
    		long value = mValue;
    		mValue--;
    		mRWLock.writeLock().unlock();
    		return value;
    	}
    	finally{
    		mRWLock.readLock().unlock();
    	}
=======
    public long getAndDecrement() {
        // TODO - you fill in here
>>>>>>> upstream/master
    }

    /**
     * @brief Atomically increments by one the current value
     *
     * @returns the updated value
     */
<<<<<<< HEAD
    public long incrementAndGet()
    {
    	// TODO -- you fill in here
    	try{
    		mRWLock.writeLock().lock();
    		mRWLock.readLock().lock();
    		mValue++;
    		long value = mValue;
    		mRWLock.writeLock().unlock();
    		return value;
    	}
    	finally{
    		mRWLock.readLock().unlock();
    	}
=======
    public long incrementAndGet() {
        // TODO - you fill in here
>>>>>>> upstream/master
    }
}

