package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgToast2604 is a Querydsl query type for QPgToast2604
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgToast2604 extends com.mysema.query.sql.RelationalPathBase<QPgToast2604> {

    private static final long serialVersionUID = -8643340;

    public static final QPgToast2604 pgToast2604 = new QPgToast2604("pg_toast_2604");

    public final SimplePath<byte[]> chunkData = createSimple("chunk_data", byte[].class);

    public final NumberPath<Long> chunkId = createNumber("chunk_id", Long.class);

    public final NumberPath<Integer> chunkSeq = createNumber("chunk_seq", Integer.class);

    public final com.mysema.query.sql.PrimaryKey<QPgToast2604> pgToast2604Index = createPrimaryKey(chunkId, chunkSeq);

    public QPgToast2604(String variable) {
        super(QPgToast2604.class, forVariable(variable), "pg_toast", "pg_toast_2604");
    }

    @SuppressWarnings("all")
    public QPgToast2604(Path<? extends QPgToast2604> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_toast", "pg_toast_2604");
    }

    public QPgToast2604(PathMetadata<?> metadata) {
        super(QPgToast2604.class, metadata, "pg_toast", "pg_toast_2604");
    }

}

