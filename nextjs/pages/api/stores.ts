import type { NextApiRequest, NextApiResponse } from 'next';
import { Store } from '../../types/store';

export default async function handler(
  req: NextApiRequest,
  res: NextApiResponse<Store[]>
) {
  const stores = (await import('../../public/stores.json')).default as Store[];

  res.status(200).json(stores);
}
