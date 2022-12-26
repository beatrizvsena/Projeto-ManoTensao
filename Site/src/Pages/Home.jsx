import React from 'react'
import { Comments } from '../componets/Comments/Comments'
import { Footer } from '../componets/Footer/Footer'
import { Header } from '../componets/Header/Header'
import { LogoInfo } from '../componets/LogoInfo/LogoInfo'
import { Mano } from '../componets/Mano/Mano'
import { Meet } from '../componets/Meet/Meet'
import { Plans } from '../componets/Plans/Plans'

export const Home = () => {
    return (
        <>
            <Header />
            <Mano />
            <Meet />
            <Plans />
            <Comments />
            <LogoInfo />
            <Footer />
        </>
    )
}
