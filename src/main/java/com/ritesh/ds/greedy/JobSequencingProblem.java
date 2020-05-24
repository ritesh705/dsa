package com.ritesh.ds.greedy;

import java.util.Arrays;

class Job implements Comparable<Job>
{
    private char id;
    private Integer profit;
    private Integer deadline;

    Job(char id, int deadline, int profit)
    {
        this.id = id;
        this.profit = profit;
        this.deadline = deadline;
    }

    public char getId() {
        return id;
    }

    public Integer getProfit() {
        return profit;
    }

    public Integer getDeadline() {
        return deadline;
    }

    @Override
    public int compareTo(Job o)
    {
        if(this.profit > o.profit)
            return -1;
        return 1;
    }
}

public class JobSequencingProblem
{

    private static Job[] scheduleJob01(Job[] jobs)
    {
        int size = jobs.length;
        Job result[] = new Job[size];
        int count = 0;
        int index = 0;

        Arrays.sort(jobs);

        for(int i=0; i<size; i++)
        {
            if(count < jobs[i].getDeadline())
            {
                result[index] = jobs[i];
                index++;
                count++;
            }
        }
        return result;
    }

    private static Job[] scheduleJob02(Job[] jobs)
    {
        int size = jobs.length;
        Job result[] = new Job[size];
        boolean slot[] = new boolean[size];

        Arrays.sort(jobs);

        for(int i=0; i<size; i++)
        {
            for(int j = Math.min(size, jobs[i].getDeadline())-1; j>=0; j--)
            {
                if(slot[j] == false)
                {
                    result[j] = jobs[i];
                    slot[j] = true;
                    break;
                }
            }
        }
        return result;
    }


    public static void main(String[] args)
    {
        Job jobs[] = {new Job('a', 2, 100),
                new Job('b', 1, 19),
                new Job('c', 2, 27),
                new Job('d', 1, 25),
                new Job('e', 3, 15)};

        Job[] result01 = scheduleJob01(jobs);

        Job[] result02 = scheduleJob02(jobs);

        for(Job o : result01)
        {
            if(o != null)
            {
                System.out.println(o.getId()+" ");
            }
        }

        for(Job o : result02)
        {
            if(o != null)
            {
                System.out.println(o.getId()+" ");
            }
        }
    }
}