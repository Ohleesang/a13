package com.example.a13

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        class Solution {
            fun solution(n: Int): Int {
                var answer = 0
                var number =n.toString()
                var result = number.toCharArray()
                for(i in 0..result.size-1){
                    answer += Character.getNumericValue(result.get(i))
                    //Char의 toInt()는 ascii코드값을 반환하므로!
                }
                    return answer
            }
        }
        val a = Solution()
        a.solution(123)
        a.solution(987)
    }
}
