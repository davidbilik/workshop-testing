package cz.ackee.testing.demo5

import io.reactivex.Observable
import io.reactivex.Single
import io.reactivex.schedulers.Schedulers
import java.util.concurrent.TimeUnit
import kotlin.random.Random

class NumberRepository {
    fun getNumbers(num: Int): Observable<Int> {
        return Observable.fromIterable(0..num)
                .subscribeOn(Schedulers.newThread())
    }

    private fun getNumberSquare(num: Int): Single<Int> {
        return Single.just(num * num)
                .delay(Random.nextLong(10), TimeUnit.MILLISECONDS)
                .subscribeOn(Schedulers.newThread())
    }

    fun getNumbersSquared(num: Int): Observable<Int> {
        return getNumbers(num)
                .flatMapSingle { getNumberSquare(it) }
    }
}