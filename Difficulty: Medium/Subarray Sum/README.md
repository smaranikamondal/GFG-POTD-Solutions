<h2><a href="https://www.geeksforgeeks.org/problems/subarray-sum-1661797679/0">Subarray Sum</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">You are given an array&nbsp;<strong>A</strong>&nbsp;of&nbsp;<strong>N</strong>&nbsp;integers and an integer&nbsp;<strong>S</strong>. Find the length of the smallest subarray which satisfy the following condition:</span></p>

<ul>
	<li><span style="font-size:18px">The Sum of elements of the subarray is at least&nbsp;<strong>S</strong>.</span></li>
</ul>

<p><span style="font-size:18px">If no such subarray exists, print <strong>-1</strong>.&nbsp;</span></p>

<p><span style="font-size:18px"><strong>Input Format:</strong></span></p>

<ul>
	<li><span style="font-size:18px">The first&nbsp;line&nbsp;contains an integer <strong><em>T</em></strong>&nbsp;denoting the number of test cases</span></li>
	<li><span style="font-size:18px">The first line of&nbsp;each test case contains two&nbsp;integers&nbsp;<strong>N, S</strong>&nbsp;- the number of elements in the array and the required sum.</span></li>
	<li><span style="font-size:18px">The second line of each test case contains&nbsp;<strong>N</strong>&nbsp;integers -&nbsp;<strong>A<sub>1</sub>,A<sub>2</sub>,....,A<sub>N</sub>.</strong></span></li>
</ul>

<p><br>
<span style="font-size:18px"><strong>Output Format:</strong><br>
For each test case print&nbsp;the answer in a new line.<br>
<strong>Note:&nbsp;</strong>Generated output is white space sensitive, do not add extra spaces on unnecessary newline characters.</span></p>

<p><br>
<span style="font-size:18px"><strong>Constraints:</strong><br>
1&nbsp;≤ <strong>T</strong>&nbsp;≤ 1000<br>
1&nbsp;≤ <strong>N</strong>&nbsp;≤ 100,000<br>
1&nbsp;≤ <strong>S</strong>&nbsp;≤ 10<sup>18</sup><br>
1&nbsp;≤ <strong>A<sub>i</sub></strong>&nbsp;≤ 10<sup>9</sup></span></p>

<p><br>
<span style="font-size:18px"><strong>Example:</strong></span></p>

<pre><span style="font-size:18px"><strong>Sample Input:
</strong>3
4 87
28 26 24 26&nbsp;
3 131
3 14 8&nbsp;
6 15
28 15 15 4 21 8&nbsp;

<strong>Sample Output:</strong>
4
-1
1

<strong>Explanation:</strong>
In the first test case, we need to
consider the entire array.
In the second test case, it is not possible
to satisfy the given condition.</span>
</pre>
</div>