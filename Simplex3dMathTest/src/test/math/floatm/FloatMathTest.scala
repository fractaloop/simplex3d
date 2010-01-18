/*
 * Simplex3d, MathTest package
 * Copyright (C) 2009-2010 Simplex3d Team
 *
 * This file is part of Simplex3dMathTest.
 *
 * Simplex3dMathTest is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Simplex3dMathTest is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package test.math.floatm

import org.scalatest._

import simplex3d.math._
import simplex3d.math.floatm.renamed._
import simplex3d.math.floatm.FloatMath._


/**
 * @author Aleksey Nikiforov (lex)
 */
class FloatMathTest extends FunSuite {

    test("Float functions") {
        expect(0) { radians(0) }
        expect(Pi) { radians(180) }
        expect(-2*Pi) { radians(-360) }

        expect(0) { degrees(0) }
        expect(180) { degrees(Pi) }
        expect(-360) { degrees(-2*Pi) }

        assert(approxEqual(0, sin(0), 1e-6f))
        assert(approxEqual(0.5f, sin(Pi/6), 1e-6f))
        assert(approxEqual(inversesqrt(2), sin(Pi/4), 1e-6f))
        assert(approxEqual(sqrt(3)/2, sin(Pi/3), 1e-6f))
        assert(approxEqual(1, sin(Pi/2), 1e-6f))
        assert(approxEqual(0, sin(Pi), 1e-6f))
        assert(approxEqual(-1, sin(3*Pi/2), 1e-6f))
        assert(approxEqual(0, sin(2*Pi), 1e-6f))

        assert(approxEqual(1, cos(0), 1e-6f))
        assert(approxEqual(sqrt(3)/2, cos(Pi/6), 1e-6f))
        assert(approxEqual(inversesqrt(2), cos(Pi/4), 1e-6f))
        assert(approxEqual(0.5f, cos(Pi/3), 1e-6f))
        assert(approxEqual(0, cos(Pi/2), 1e-6f))
        assert(approxEqual(-1, cos(Pi), 1e-6f))
        assert(approxEqual(0, cos(3*Pi/2), 1e-6f))
        assert(approxEqual(1, cos(2*Pi), 1e-6f))
        
        assert(approxEqual(0, tan(0), 1e-6f))
        assert(approxEqual(inversesqrt(3), tan(Pi/6), 1e-6f))
        assert(approxEqual(1, tan(Pi/4), 1e-6f))
        assert(approxEqual(sqrt(3), tan(Pi/3), 1e-6f))

        assert(approxEqual(0, asin(0), 1e-6f))
        assert(approxEqual(Pi/6, asin(0.5f), 1e-6f))
        assert(approxEqual(Pi/4, asin(inversesqrt(2)), 1e-6f))
        assert(approxEqual(Pi/3, asin(sqrt(3)/2), 1e-6f))
        assert(approxEqual(Pi/2, asin(1), 1e-6f))

        assert(approxEqual(0, acos(1), 1e-6f))
        assert(approxEqual(Pi/6, acos(sqrt(3)/2), 1e-6f))
        assert(approxEqual(Pi/4, acos(inversesqrt(2)), 1e-6f))
        assert(approxEqual(Pi/3, acos(0.5f), 1e-6f))
        assert(approxEqual(Pi/2, acos(0), 1e-6f))

        assert(approxEqual(0, atan(0), 1e-6f))
        assert(approxEqual(Pi/6, atan(inversesqrt(3)), 1e-6f))
        assert(approxEqual(Pi/4, atan(1), 1e-6f))
        assert(approxEqual(Pi/3, atan(sqrt(3)), 1e-6f))

        assert(approxEqual(0, atan(0, 1), 1e-6f))
        assert(approxEqual(Pi/6, atan(tan(Pi/6), 1), 1e-6f))
        assert(approxEqual(Pi/4, atan(1, 1), 1e-6f))
        assert(approxEqual(Pi/3, atan(tan(Pi/3), 1), 1e-6f))
        assert(approxEqual(Pi/2, atan(1, 0), 1e-6f))

        assert(approxEqual(-3.62686040784701876767f, sinh(-2), 1e-6f))
        assert(approxEqual(-1.17520119364380145688f, sinh(-1), 1e-6f))
        assert(approxEqual(0, sinh(0), 1e-6f))
        assert(approxEqual(1.17520119364380145688f, sinh(1), 1e-6f))
        assert(approxEqual(3.62686040784701876767f, sinh(2), 1e-6f))

        assert(approxEqual(3.76219569108363145956f, cosh(-2), 1e-6f))
        assert(approxEqual(1.54308063481524377848f, cosh(-1), 1e-6f))
        assert(approxEqual(1, cosh(0), 1e-6f))
        assert(approxEqual(1.54308063481524377848f, cosh(1), 1e-6f))
        assert(approxEqual(3.76219569108363145956f, cosh(2), 1e-6f))

        assert(approxEqual(-0.96402758007581688395f, tanh(-2), 1e-6f))
        assert(approxEqual(-0.76159415595576488812f, tanh(-1), 1e-6f))
        assert(approxEqual(0, tanh(0), 1e-6f))
        assert(approxEqual(0.76159415595576488812f, tanh(1), 1e-6f))
        assert(approxEqual(0.96402758007581688395f, tanh(2), 1e-6f))

        assert(approxEqual(-2, asinh(-3.62686040784701876767f), 1e-6f))
        assert(approxEqual(-1, asinh(-1.17520119364380145688f), 1e-6f))
        assert(approxEqual(0, asinh(0), 1e-6f))
        assert(approxEqual(1, asinh(1.17520119364380145688f), 1e-6f))
        assert(approxEqual(2, asinh(3.62686040784701876767f), 1e-6f))

        assert(approxEqual(0, acosh(1), 1e-6f))
        assert(approxEqual(1, acosh(1.54308063481524377848f), 1e-6f))
        assert(approxEqual(2, acosh(3.76219569108363145956f), 1e-6f))

        assert(approxEqual(-2, atanh(-0.96402758007581688395f), 1e-6f))
        assert(approxEqual(-1, atanh(-0.76159415595576488812f), 1e-6f))
        assert(approxEqual(0, atanh(0), 1e-6f))
        assert(approxEqual(1, atanh(0.76159415595576488812f), 1e-6f))
        assert(approxEqual(2, atanh(0.96402758007581688395f), 1e-6f))

        assert(approxEqual(sqrt(2), pow(2, 0.5f), 1e-6f))
        assert(approxEqual(4, pow(2, 2), 1e-6f))

        assert(approxEqual(E, exp(1), 1e-6f))
        assert(approxEqual(E*E, exp(2), 1e-6f))

        assert(approxEqual(0, log(1), 1e-6f))
        assert(approxEqual(2, log(E*E), 1e-6f))

        assert(approxEqual(2, exp2(1), 1e-6f))
        assert(approxEqual(4, exp2(2), 1e-6f))

        assert(approxEqual(0, log2(1), 1e-6f))
        assert(approxEqual(2, log2(4), 1e-6f))

        assert(approxEqual(1.4142135623730950488f, sqrt(2), 1e-6f))
        assert(approxEqual(2, sqrt(4), 1e-6f))

        assert(approxEqual(1/1.4142135623730950488f, inversesqrt(2), 1e-6f))
        assert(approxEqual(0.5f, inversesqrt(4), 1e-6f))

        assert(1 == abs(-1))
        assert(0 == abs(0))
        assert(1 == abs(1))

        assert(-1 == sign(-1))
        assert(0 == sign(0))
        assert(1 == sign(1))

        assert(-1 == floor(-1))
        assert(-1 == floor(-0.5f))
        assert(0 == floor(0))
        assert(1 == floor(1.5f))
        assert(1 == floor(1))

        assert(-1 == trunc(-1))
        assert(-1 == trunc(-1.5f))
        assert(0 == trunc(0))
        assert(1 == trunc(1.5f))
        assert(1 == trunc(1))

        assert(-1 == round(-1))
        assert(-1 == round(-1.4f))
        assert(-2 == round(-1.6f))
        assert(0 == round(0))
        assert(1 == round(1.4f))
        assert(1 == round(1))
        assert(2 == round(1.6f))

        assert(-1 == roundEven(-1))
        assert(-1 == roundEven(-1.4f))
        assert(-2 == roundEven(-1.5f))
        assert(-2 == roundEven(-1.6f))
        assert(-2 == roundEven(-2.5f))
        assert(0 == roundEven(0))
        assert(1 == roundEven(1))
        assert(1 == roundEven(1.4f))
        assert(2 == roundEven(1.5f))
        assert(2 == roundEven(1.6f))
        assert(2 == roundEven(2.5f))

        assert(-1 == ceil(-1))
        assert(-1 == ceil(-1.1f))
        assert(0 == ceil(0))
        assert(1 == ceil(1))
        assert(1 == ceil(0.1f))

        assert(0.9f == fract(-1.1f))
        assert(0 == fract(-1))
        assert(0 == fract(0))
        assert(0 == fract(1))
        assert(0.25f == fract(1.25f))

        assert(0.25f == mod(10.25f, 2.5f))
        assert(-0.25f == mod(-10.25f, -2.5f))
        assert(2.25f == mod(-10.25f, 2.5f))
        assert(-2.25f == mod(10.25f, -2.5f))
        assert(0 == mod(0, 2.5f))

        assert(1 == min(1, 2))
        assert(1 == min(2, 1))
        assert(1 == min(1, 1))

        assert(2 == max(1, 2))
        assert(2 == max(2, 1))
        assert(2 == max(2, 2))

        assert(1 == clamp(0, 1, 3))
        assert(1 == clamp(1, 1, 3))
        assert(2 == clamp(2, 1, 3))
        assert(3 == clamp(3, 1, 3))
        assert(3 == clamp(4, 1, 3))

        assert(0 == mix(0, 4, 0))
        assert(1 == mix(0, 4, 0.25f))
        assert(2 == mix(0, 4, 0.5f))
        assert(3 == mix(0, 4, 0.75f))
        assert(4 == mix(0, 4, 1))
        

//
//    def mix(x: Float, y: Float, a: Float) :Float = x*(1 - a) + y*a
//    def step(edge: Float, x: Float) :Float = if (x < edge) 0 else 1
//    def smoothstep(edge0: Float, edge1: Float, x: Float) :Float = {
//        if (x <= edge0) 0
//        else if (x >= edge1) 1
//        else {
//            val t = (x - edge0)/(edge1 - edge0)
//            t*t*(3 - 2*t)
//        }
//    }
//
//    def isnan(x: Float) :Boolean = java.lang.Float.isNaN(x)
//    def isinf(x: Float) :Boolean = java.lang.Float.isInfinite(x)
//
//    def length(x: Float) :Float = abs(x)
//    def distance(x: Float, y: Float) :Float = abs(x - y)
//    def dot(x: Float, y: Float) :Float = x*y
//    def normalize(x: Float) :Float = sign(x)
//    def faceforward(n: Float, i: Float, nref: Float) :Float = {
//        if (i*nref < 0) n else -n
//    }
//
//    def reflect(i: Float, n: Float) :Float = {
//        i - 2*(n*i)*n
//    }
//    def refract(i: Float, n: Float, eta: Float) :Float = {
//        val ni = n*i
//        val k = 1 - eta*eta*(1 - ni*ni)
//        if (k < 0) 0 else eta*i - (eta*ni + sqrt(k))*n
//    }
    }

}