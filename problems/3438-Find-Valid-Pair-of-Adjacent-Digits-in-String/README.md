<div align="center">

# 3438. Find Valid Pair of Adjacent Digits in String

![Difficulty](https://img.shields.io/badge/DIFFICULTY-Easy-00b8a3?style=for-the-badge&labelColor=1a1a2e)  ![Language](https://img.shields.io/badge/LANGUAGE-Java-6c5ce7?style=for-the-badge&labelColor=1a1a2e)  ![Solutions](https://img.shields.io/badge/SOLUTIONS-1-6c5ce7?style=for-the-badge&labelColor=1a1a2e)  ![Date](https://img.shields.io/badge/DATE-2026--10--20-605d5d?style=for-the-badge&labelColor=1a1a2e)

[![View on LeetCode](https://img.shields.io/badge/View%20on-LeetCode-ffa116?style=flat-square&logo=leetcode&logoColor=ffa116)](https://leetcode.com/problems/find-valid-pair-of-adjacent-digits-in-string/)

</div>

---

<div align="center">

<picture>
  <source media="(prefers-color-scheme: dark)" srcset="panel-dark.svg">
  <source media="(prefers-color-scheme: light)" srcset="panel-light.svg">
  <img alt="Topics: Hash Table, String, Counting — best runtime 4 ms (Beats 43%), best memory 43.7 MB (Beats 92%)" src="panel-dark.svg">
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

You are given a string `s` consisting only of digits. A **valid pair** is defined as two **adjacent** digits in `s` such that:

	- The first digit is **not equal** to the second.

	- Each digit in the pair appears in `s` **exactly** as many times as its numeric value.

Return the first **valid pair** found in the string `s` when traversing from left to right. If no valid pair exists, return an empty string.

 

**Example 1:**

**Input:** s = "2523533"

**Output:** "23"

**Explanation:**

Digit `'2'` appears 2 times and digit `'3'` appears 3 times. Each digit in the pair `"23"` appears in `s` exactly as many times as its numeric value. Hence, the output is `"23"`.

**Example 2:**

**Input:** s = "221"

**Output:** "21"

**Explanation:**

Digit `'2'` appears 2 times and digit `'1'` appears 1 time. Hence, the output is `"21"`.

**Example 3:**

**Input:** s = "22"

**Output:** ""

**Explanation:**

There are no valid adjacent pairs.

 

**Constraints:**

	- `2 <= s.length <= 100`

	- `s` only consists of digits from `'1'` to `'9'`.

---

<div align="center">

<sub>Auto-synced by <strong>LeetSync</strong> · Built by <a href="https://deveshsamant.in/">Devesh Samant</a></sub>

</div>
