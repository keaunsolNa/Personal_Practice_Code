import React, { ChangeEvent, useCallback, useState } from 'react';

type ChangeEventType = ChangeEvent<HTMLInputElement | HTMLTextAreaElement>;

function useInput(
    initialValue = '',
    maxLength?: number
): [
    string,
    (e: ChangeEventType) => void,
    React.Dispatch<React.SetStateAction<string>>
] {
    const [value, setValue] = useState(initialValue);

    const onChange = useCallback(
        (e: ChangeEventType) => {
            if (e) {
                setValue(e.target.value.slice(0, maxLength));
            }
        },
        [maxLength]
    );

    return [value, onChange, setValue];
}

export default useInput;
