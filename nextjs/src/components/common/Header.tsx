import React from 'react';
import Link from 'next/link';
import Image from "next/image";
import styles from '../../styles/header.module.scss';

interface Props {
    rightElements?: React.ReactElement[];
}

const HeaderComponent = ({ rightElements }: Props) => {
  return (
    <header className={styles.header}>
      <div className={styles.flexItem}>
        <Link href="/" className={styles.box}>
            <Image
                src="https://lecture-1.vercel.app/inflearn.png"
                width={110}
                height={20}
                alt="인프런 로고"
            />
        </Link>
      </div>
        {rightElements &&
            <div className={styles.fixedItem}>
                {rightElements}
            </div>
        }
    </header>
  );
};

export default HeaderComponent;
