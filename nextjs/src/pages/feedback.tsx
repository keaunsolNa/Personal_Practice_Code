import { Fragment } from 'react';
import Header from '../components/common/Header';
import styles from '../styles/header.module.scss';
import Link from "next/link";
import { VscFeedback } from "@react-icons/all-files/vsc/VscFeedback";
import { AiOutlineShareAlt } from "@react-icons/all-files/ai/AiOutlineShareAlt";

export default function Feedback(){
    return (

        <Fragment>
            <Header rightElements={[
                <button
                    onClick={(e) => {
                    alert('복사!');
                }}
                className={styles.box}
                style={{ marginRight: 8}}
                key="button"
                >
                    <AiOutlineShareAlt size={20}/>
                </button>,
                <Link href="/feedback" className={styles.box} key="Link">
                    <VscFeedback size={20}/>
                </Link>,
            ]}
            />
            <main></main>
        </Fragment>
    );
}
