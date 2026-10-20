<div align="center">

# 3452. Sum of Good Numbers

![Difficulty](https://img.shields.io/badge/DIFFICULTY-Easy-00b8a3?style=for-the-badge&labelColor=1a1a2e)  ![Language](https://img.shields.io/badge/LANGUAGE-Java-6c5ce7?style=for-the-badge&labelColor=1a1a2e)  ![Solutions](https://img.shields.io/badge/SOLUTIONS-1-6c5ce7?style=for-the-badge&labelColor=1a1a2e)  ![Date](https://img.shields.io/badge/DATE-2026--10--20-605d5d?style=for-the-badge&labelColor=1a1a2e)

[![View on LeetCode](https://img.shields.io/badge/View%20on-LeetCode-ffa116?style=flat-square&logo=leetcode&logoColor=ffa116)](https://leetcode.com/problems/sum-of-good-numbers/)

</div>

---

<div align="center">

<picture>
  <source media="(prefers-color-scheme: dark)" srcset="panel-dark.svg">
  <source media="(prefers-color-scheme: light)" srcset="panel-light.svg">
  <img alt="Topics: Array — best runtime 1 ms (Beats 97%), best memory 44.8 MB (Beats 97%)" src="panel-dark.svg">
</picture>

</div>

> **New personal best** — Runtime improved on this submission.

### HOW IT WENT

| | |
|:--|:--|
| **Attempts** | first try |
| **Time to solve** | under a minute |
| **Verdicts** | ✅ Accepted |

---

### NOTES

_No notes yet._

---

### SOLUTIONS (1)

| # | File | Language | Date |
|:-:|------|:--------:|:----:|
| 1 | [sol1.java](./sol1.java) | `Java` | 2026-10-20 ← **latest** |

---

### PROBLEM DESCRIPTION

Given an array of integers `nums` and an integer `k`, an element `nums[i]` is considered **good** if it is **strictly** greater than the elements at indices `i - k` and `i + k` (if those indices exist). If neither of these indices *exists*, `nums[i]` is still considered **good**.

Return the **sum** of all the **good** elements in the array.

 

**Example 1:**

**Input:** nums = [1,3,2,1,5,4], k = 2

**Output:** 12

**Explanation:**

The good numbers are `nums[1] = 3`, `nums[4] = 5`, and `nums[5] = 4` because they are strictly greater than the numbers at indices `i - k` and `i + k`.

**Example 2:**

**Input:** nums = [2,1], k = 1

**Output:** 2

**Explanation:**

The only good number is `nums[0] = 2` because it is strictly greater than `nums[1]`.

 

**Constraints:**

	- `2 <= nums.length <= 100`

	- `1 <= nums[i] <= 1000`

	- `1 <= k <= floor(nums.length / 2)`

---

<div align="center">

<sub>Auto-synced by <strong>LeetSync</strong> · Built by <a href="https://deveshsamant.in/">Devesh Samant</a></sub>

</div>
