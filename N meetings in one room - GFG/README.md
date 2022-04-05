# N meetings in one room
## Easy 
<div class="problem-statement">
                <p><a onclick="gtagHelperFunction('clickopen','salesevent_gsc_problemspage_promobanner')" href="https://practice.geeksforgeeks.org/summer-carnival-2022?utm_source=practiceproblems&amp;utm_medium=problemspromobanner&amp;utm_campaign=gsc22" target="_blank"></a></p><div style="margin: 14px 0px !important;" class="row"><a onclick="gtagHelperFunction('clickopen','salesevent_gsc_problemspage_promobanner')" href="https://practice.geeksforgeeks.org/summer-carnival-2022?utm_source=practiceproblems&amp;utm_medium=problemspromobanner&amp;utm_campaign=gsc22" target="_blank">             <div class="col-md-12" style="cursor:pointer;background: #EFF8F3 0% 0% no-repeat padding-box; display: flex; align-items: center; position:                 relative; padding: 1.5%; border-radius: 10px; display: inline-block; text-align: center; font-weight: 600; color: #333"> <img src="https://media.geeksforgeeks.org/img-practice/gcs2022thumbnail-1649059370.png" alt="Lamp" width="46" height="40" style="background: transparent 0% 0% no-repeat padding-box;opacity: 1; margin: 0 16px;" class="img-responsive"> Geeks Summer Carnival is LIVE NOW &nbsp; <i class="fa fa-external-link" aria-hidden="true"></i> </div></a></div><p><span style="font-size:18px">There is <strong>one</strong> meeting room in a firm. There are <strong>N</strong> meetings in the form of <strong>(start[i], end[i])</strong> where <strong>start[i]&nbsp;</strong>is start time of meeting <strong>i </strong>and <strong>end[i] </strong>is finish time of meeting <strong>i.</strong><br>
What is the <strong>maximum</strong> number of meetings that can be accommodated in the meeting room when only one meeting can be held in the meeting room at a particular time? </span></p>

<p><span style="font-size:18px"><strong>Note:</strong>&nbsp;Start time of one chosen meeting can't be equal to the end time of the other chosen meeting.</span></p>

<p><br>
<span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>N = 6
start[] = {1,3,0,5,8,5}
end[] =  {2,4,6,7,9,9}
<strong>Output: </strong>
4<strong>
Explanation:
</strong>Maximum four meetings can be held with
given start and end timings.</span>
<span style="font-size:18px">The meetings are - (1, 2),(3, 4), (5,7) and (8,9)</span>
</pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
N</strong> = 3
<strong>start[]</strong> = {10, 12, 20}
<strong>end[]</strong> = {20, 25, 30}
<strong>Output: </strong>
1<strong>
Explanation:
</strong>Only one&nbsp;meetings can be held
with given start and end timings.</span></pre>

<p><br>
<span style="font-size:18px"><strong>Your Task</strong>&nbsp;:<br>
You don't need to read inputs or print anything. Complete the function <strong>maxMeetings()</strong><em>&nbsp;</em>that takes two&nbsp;arrays <strong>start[] </strong>and <strong>end[] </strong>along with their size <strong>N</strong> as input parameters and returns the <strong>maximum</strong> number of meetings that can be held in the meeting room.</span></p>

<p><br>
<span style="font-size:18px"><strong>Expected Time Complexity </strong>: O(N*LogN)</span><br>
<span style="font-size:18px"><strong>Expected Auxilliary Space</strong> : O(N)</span></p>

<p><br>
<span style="font-size:18px"><strong>Constraints:</strong></span><br>
<span style="font-size:18px">1 ≤ N&nbsp;≤ 10<sup>5</sup></span><br>
<span style="font-size:18px">0 ≤ <strong>star</strong>t<strong>[i]</strong> &lt; <strong>end[i]</strong>&nbsp;≤ 10<sup>5</sup></span></p>
 <p></p>
            </div>