public class SimpleHashtable {

    private StoredPlayer[] hashtable;

    public SimpleHashtable()
    {
        hashtable = new StoredPlayer[10];
    }
    //this could cause collisions
    private int hashKey(String key)
    {
        return key.length() % hashtable.length; //makes sure this key maps to a range the hashtable can handle
    }

    public void put(String key, Player value)
    {
        int hashedKey = hashKey(key);

        if(isOccupied(hashedKey))
        {
            //linear probing
            int stoppingIndex = hashedKey;

            if(hashedKey == hashtable.length - 1)
            {
                hashedKey = 0;
            }
            else
            {
                hashedKey++;
            }
            while (isOccupied(hashedKey) && hashedKey != stoppingIndex)
            {
                hashedKey = (hashedKey + 1) % hashtable.length;
            }
        }

        if(isOccupied(hashedKey))
        {
            System.out.println("There is an element at position " + hashedKey);
        }
        else
        {
            hashtable[hashedKey] = new StoredPlayer(key, value);
        }
    }

    public Player get(String key)
    {
        int hashedKey = findKey(key);

        if(hashedKey == -1)
        {
            return null;
        }
        return hashtable[hashedKey].value;
    }
    public Player remove(String key)
    {
        int index = findKey(key);

        if (index == -1) //nothings there
        {
            return null;
        }
        Player removed = hashtable[index].value;
        hashtable[index] = null; //removed when set to null, java will remove it for me

        int next = (index + 1) % hashtable.length;
        while (hashtable[next] != null) {
            StoredPlayer toRehash = hashtable[next];
            hashtable[next] = null;
            put(toRehash.key, toRehash.value);
            next = (next + 1) % hashtable.length;
        } //rehashes everything above the value so linear probing doesnt skip the empty slot

        return removed;
    }
    private int findKey(String key)
    {
        int hashedKey = hashKey(key);

        if (hashtable[hashedKey] != null && hashtable[hashedKey].key.equals(key))
        {
            return hashedKey;
        }

            //linear probing
        int stoppingIndex = hashedKey;

        if (hashedKey == hashtable.length - 1) {
            hashedKey = 0;
        } else {
            hashedKey++;
        }
        while (hashedKey != stoppingIndex
                && hashtable[hashedKey] != null &&
            !hashtable[hashedKey].key.equals(key)) {

            hashedKey = (hashedKey + 1) % hashtable.length;
        }

        if (hashtable[hashedKey] != null
        && hashtable[hashedKey].key.equals(key))
        {
            return hashedKey;
        }
        return -1;

    }
    private boolean isOccupied(int index)
    {
        return hashtable[index] != null;
    }

    public void printHashtable()
    {
        for (int i = 0; i < hashtable.length; i++)
        {
            System.out.println("Element " + i + " " + hashtable[i]);
        }
    }
}
